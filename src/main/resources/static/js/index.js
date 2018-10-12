var viewModel = avalon.define({
    $id:"viewModel",
    dataList:{},
    text:"请求数据",
    request:function () {
        $.ajax({
            type:"post",
            url:"hello",
            data:{},
            success:function (data) {
                viewModel.dataList = data;
                viewModel.text = "数据请求成功，已渲染";

            }
        })

    }
})