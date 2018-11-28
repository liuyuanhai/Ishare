$(function () {


    //添加
    $('.addNav').bind('click',function(){

        //控制新增框数量
        debugger;
        var _html = '<li><input type="text" class="navInput" value=""/><span class="ybtn" onclick="yesToAdd()"></span><span class="nbtn" onclick="noToAdd()"></span></li>';
        $(this).parent().eq(0).before(_html);

    });


})


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

function noToAdd() {
    getNav(1);
}
