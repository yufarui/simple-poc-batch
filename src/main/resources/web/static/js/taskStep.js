layui.define(['layer', 'form', 'table'], function(exports) {
    var layer = layui.layer
    var form = layui.form;
    var table = layui.table;

    exports('taskStep', {

        init: function() {
            table.render({
                elem: '#task',
                url: '/task/step/list',
                method: 'get',
                limit: 50,
                cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                ,
                cols: [[{
                    field: 'stepExecutionId',
                    width: '10%',
                    title: '步骤编号',
                    align: 'center'
                }, {
                    field: 'stepName',
                    width: '20%',
                    title: '步骤名称',
                    align: 'center'
                }, {
                    field: 'jobExecutionId',
                    width: '10%',
                    title: '对应jobId',
                    align: 'center'
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
                    title: '步骤状态',
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
