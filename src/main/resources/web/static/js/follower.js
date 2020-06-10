layui.define(['layer', 'form', 'table'], function(exports){
  var layer = layui.layer
  var form = layui.form;
  var table = layui.table;

  layer.msg("欢迎查看节点信息");

  exports('follower', {

        init : function (){
            table.render({
            elem: '#follower'
            ,url:'/follower/list'
            ,method:'get'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [[
              {field:'ip', width:'30%', title: 'ip地址',align:'center'}
              ,{field:'port', width:'30%', title: '端口',align:'center'}
              ,{field:'state', width:'30%', title: '状态',align:'center'}
            ]]
            });
        }
  });
});
