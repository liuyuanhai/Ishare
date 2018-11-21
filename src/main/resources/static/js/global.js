$(function(){
    getNav(1);
    getCon(1);
})

//加载左侧导航 param userId
function getNav(userId){
    $.ajax({
        type:'get',
        url:"/leftNav/getList",
        dataType : 'text',
        success:function (data) {
            $('#leftNav').html(data);
            // initlayout();
        },
        error:function () {
            alert("页面加载失败");
        }
    });
}

//加载内容 param dataId
function getCon(dataId){
    $.ajax({
        type:'get',
        url:"/content/getList",
        dataType : 'text',
        success:function (data) {
            $('#rightCon').html(data);
            // initlayout();
        },
        error:function () {
            alert("页面加载失败");
        }
    });
}