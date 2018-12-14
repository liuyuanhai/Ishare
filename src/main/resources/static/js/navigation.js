$(function () {


    //添加
    $('.addNav').bind('click',function(){
        //控制新增框数量
        debugger;
        var _html = '<div><input type="text" class="navInput" value=""/><span class="ybtn" onclick="yesToAdd()"></span><span class="nbtn" onclick="noToAdd()"></span></div>';
        $(this).parent().eq(0).before(_html);

    });

    //编辑
    $(".nav_com a").dblclick(function(){
        $(this).find('.navText').addClass('hide');
        $(this).find('.nbtn').removeClass('hide');
        $(this).find('.ybtn').removeClass('hide');
        $(this).find('.navInput').removeClass('hide');
        $(this).find('.navInput').focus();
    });




})

//新增菜单
function yesToAdd() {
    var url="/leftNav/add";
    var name=$.trim($(".navInput").val());
    $.ajax({
        url: url,
        type:"POST",
        data:{navName:name},
        //dataType:"json" ,
        success:function(data) {
            alert(data);
            getNav(1);
        }
    });
}
//取消新增
function noToAdd() {
    getNav(1);
}


function editNav() {
    var url="/leftNav/edit";
    debugger;
    var navName=$(this).find('.navText').val();
    var navId=$(this).find(".navId").val();
    $.ajax({
        url: url,
        type:"POST",
        data:{navName:navName,navId:navId},
        //dataType:"json" ,
        success:function(data) {
            $(this).find('.navText').removeClass('hide');
            $(this).find('.nbtn').addClass('hide');
            $(this).find('.ybtn').addClass('hide');
            $(this).find('.navInput').addClass('hide');
            getNav(1);
        }
    });
}

function delNav() {
    var url="/leftNav/delete";
    var navId=$.trim($(".navId").val());
    $.ajax({
        url: url,
        type:"POST",
        data:{navId:navId},
        //dataType:"json" ,
        success:function(data) {
            alert(data);
            getNav(1);
        }
    });
}
