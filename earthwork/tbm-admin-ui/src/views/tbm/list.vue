<template>
  <div class="app-container">

    <!-- 查询和其他操作 -->
    <div class="filter-container">
      <el-input v-model="listQuery.tbmId" clearable class="filter-item" style="width: 200px;" placeholder="请输入盾构机编号"/>
      <el-button class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查找</el-button>
    </div>

    <!-- 查询结果 -->
    <el-table size="small" border fit highlight-current-row>
      <el-table-column align="center" width="100px" label="盾构机ID" prop="id" sortable/>

      <el-table-column align="center" label="地址" prop="address"/>

      <el-table-column align="center" label="使用年限" prop="haveUseTime"/>

      <el-table-column align="center" label="所属公司" prop="belong"/>

      <el-table-column align="center" label="长度" prop="length"/>

      <el-table-column align="center" label="半径" prop="radius"/>

      <el-table-column align="center" label="状态" prop="status"/>

    </el-table>

  </div>
</template>

<script>
import { fetchList, approveAgency, detailApprove } from '@/api/user'
import Pagination from '@/components/Pagination' // Secondary package based on el-pagination

export default {
  name: 'User',
  components: { Pagination },
  data() {
    return {
      list: [],
      total: 0,
      listLoading: true,
      listQuery: {
        page: 1,
        limit: 20,
        username: undefined,
        mobile: undefined,
        sort: 'id',
        order: 'desc'
      }
    }
  },
  created() {
    this.getList()
  },
  methods: {
    getList() {

      }
  }
}
</script>
