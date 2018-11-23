$(function () {


    //添加
    $('.addNav').bind('click',function(){

        //控制新增框数量
        debugger;
        var _html = '<li><input type="text" class="navInput" value=""/><span class="ybtn"></span><span class="nbtn"></span></li>';
        $(this).parent().eq(0).before(_html);

    });
    $('.ybtn').on('click',function(){
        alert("qq");
        getNav(1);

    });

})

