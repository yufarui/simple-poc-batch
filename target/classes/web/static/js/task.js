layui.define(['layer', 'form', 'table'], function(exports){
  var layer = layui.layer
  var form = layui.form;
  var table = layui.table;

  layer.msg("欢迎查看任务信息");

  exports('task', {

        init : function (){
            table.render({
            elem: '#task'
            ,url:'/task/list'
            ,method:'get'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [[
              {field:'taskExecutionId', width:'20%', title: '任务编号',align:'center'}
              ,{field:'taskType', width:'20%', title: '任务类型',align:'center'}
              ,{field:'taskName', width:'20%', title: '任务名称',align:'center'}
              ,{field:'taskOrder', width:'10%', title: '任务顺序',align:'center'}
              ,{field:'param', width:'30%', title: '任务参数',align:'center'}
            ]]
            });
        }
  });
});
