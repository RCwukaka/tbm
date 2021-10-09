<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input clearable class="filter-item" style="width: 200px;" placeholder="请输入盾构机编号"/>
      <el-button class="filter-item" type="primary" icon="el-icon-search">查找</el-button>
    </div>
    <el-row :gutter="40">
      <el-col :span="8">
        <div class="card-panel">
          <div slot="header" class="clearfix">
            <span>当前状态</span>
          </div>
          <div class="text item">隧道里程</div>
          <div class="text item">当前环号</div>
          <div class="text item">掘进时间</div>
          <div class="text item">运行状态</div>
        </div>
      </el-col>
      <el-col :span="8"><div class="grid-content bg-purple"><img src="../../assets/image/tbm.gif" width="100%"></div></el-col>
      <el-col :span="8">
        <div class="card-panel">
          <div slot="header" class="clearfix">
            <span>姿态</span>
          </div>
          <div class="text item">当前姿态      </div>
          <div class="text item">水平偏差      </div>
          <div class="text item">垂直偏差      </div>
        </div>
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :span="8">
        <div class="card-panel">
          <div slot="header" class="clearfix">
            <span>推荐数值</span>
          </div>
          <div class="text item">刀盘转速      20</div>
          <div class="text item">掘进速度      34</div>
          <div class="text item">螺机转速      34</div>
          <div class="text item">左右油缸压力差      23</div>
          <div class="text item">上下油缸压力差      12</div>
        </div>
      </el-col>
      <el-col :span="8">
        <div class="card-panel">
          <div slot="header" class="clearfix">
            <span>水平预测长度</span>
          </div>
          <div class="page-line-chart">
            <chart id="hor_chartData" :option="option"/>
          </div>
        </div>
      </el-col>
      <el-col :span="8">
        <div class="card-panel">
          <div slot="header" class="clearfix">
            <span>垂直预测长度</span>
          </div>
          <div class="page-line-chart">
            <chart id="ver_chartData" :option="option"/>
          </div>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import Chart from '@/components/Chart'

export default {
  components: {
    Chart
  },
  data() {
    return {
      option: {
        tooltip: {
          trigger: 'axis',
          axisPointer: { type: 'cross' }
        },
        xAxis: {
          data: []
        },
        yAxis: [
          {
            type: 'value',
            name: '实际长度',
            data: []
          },
          {
            type: 'value',
            name: '预测长度',
            data: []
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
      },
      hor_chartData_x: ['1/0', '1/1', '1/2', '1/3'],
      hor_chartData_y: [
        [1493, 1093],
        [1310, 1192],
        [1509, 1293],
        [1199, 1728]
      ]
    }
  },
  mounted() {
    this.flashData()
  },
  methods: {
    flashData() {
      for (let i = 0; i < this.hor_chartData_x.length; i++) {
        setTimeout(() => {
          this.option.xAxis.data.push(this.hor_chartData_x[i])
          this.option.series[0].data.push(this.hor_chartData_y[i][0])
          this.option.series[1].data.push(this.hor_chartData_y[i][1])
        }, 3600 * i)
      }
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

.card-panel {
  position: relative;
  border: 1px solid #0bc4e9;
  border-radius: 4px;
  background-color: #0e2841;
  color:#fff;
}
.card-panel::before {
  position: absolute;
  top: -1px;
  bottom: -1px;
  left: 30px;
  width: calc(100% - 60px);
  content: "";
  border-top: 1px solid #007297;
  border-bottom: 1px solid #007297;
  z-index: 0;
}
.card-panel::after {
  position: absolute;
  top: 30px;
  right: -1px;
  left: -1px;
  height: calc(100% - 60px);
  content: "";
  border-right: 1px solid #007297;
  border-left: 1px solid #007297;
  z-index: 0;
  }
</style>
