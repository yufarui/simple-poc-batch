layui.define(['layer', 'form', 'table'], function(exports) {
    var layer = layui.layer
    var form = layui.form;
    var table = layui.table;

    exports('taskJob', {

        init: function() {
            table.render({
                elem: '#task',
                url: '/task/job/list',
                method: 'get',
                cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                ,
                cols: [[{
                    field: 'jobExecutionId',
                    width: '10%',
                    title: 'job编号',
                    align: 'center'
                }, {
                    field: 'jobInstanceId',
                    width: '10%',
                    title: 'job实体编号',
                    align: 'center'
                }, {
                    field: 'createTime',
                    width: '20%',
                    title: '创建时间',
                    align: 'center',
                    templet: function(data) {
                        return formatDate(data.createTime);
                    }
                }, {
                    field: 'startTime',
                    width: '20%',
                    title: '开始时间',
                    align: 'center',
                    templet: function(data) {
                        return formatDate(data.startTime);
                    }
                }, {
                    field: 'endTime',
                    width: '20%',
                    title: '结束时间',
                    align: 'center',
                    templet: function(data) {
                        return formatDate(data.endTime);
                    }
                }, {
                    field: 'status',
                    width: '20%',
                    title: '执行状态',
                    align: 'center'
                }]]
            });
        }
    });
});

function formatDate(date) {
    var date = new Date(date);
    var YY = date.getFullYear() + '-';
    var MM = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
    var DD = (date.getDate() < 10 ? '0' + (date.getDate()) : date.getDate());
    var hh = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':';
    var mm = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) + ':';
    var ss = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());
    return YY + MM + DD + " " + hh + mm + ss;
}
