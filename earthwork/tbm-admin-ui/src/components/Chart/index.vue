<template>
  <div :id="id" :style="style" :option="option"/>
</template>
<script>
export default {
  name: 'Chart',
  props: {
    // 父组件需要传递的参数：id，width，height，option
    id: {
      type: String,
      default: 'chart'
    },
    width: {
      type: String,
      default: '100%'
    },
    height: {
      type: String,
      default: '300px'
    },
    option: {
      type: Object,
      default() {
        return {
          xAxis: {
            data: []
          },
          yAxis: [
            {
              type: 'value',
              name: '实际长度'
            },
            {
              type: 'value',
              name: '预测长度'
            }
          ],
          series: [
            {
              name: '预测长度',
              type: 'line',
              smooth: true,
              data: []
            },
            {
              name: '实际长度',
              type: 'line',
              smooth: true,
              data: []
            }
          ]
        }
      }
    }
  },
  data() {
    return {
      // echarts实例
      chart: ''
    }
  },
  computed: {
    style() {
      return {
        height: this.height,
        width: this.width
      }
    }
  },
  watch: {
    // 观察option的变化
    option: {
      handler(newVal, oldVal) {
        if (this.chart) {
          console.log('重新刷新')
          if (newVal) {
            this.chart.setOption(newVal)
          } else {
            this.chart.setOption(oldVal)
          }
        } else {
          this.init()
        }
      },
      deep: true // 对象内部属性的监听，关键。
    }
  },
  mounted() {
    this.init()
  },
  methods: {
    init() {
      this.chart = this.$echarts.init(document.getElementById(this.id))
      this.chart.setOption(this.option)
      window.addEventListener('resize', this.chart.resize)
    }
  }
}
</script>
