$(function () {
    JobTrend.getData();
});

var JobTrend = {
    getData: function () {
        $.ajax({
            url: "/job/getJobs",
            type: "get",
            dataType: "json",
            success: function (data) {
                JobTrend.render(data);
            }
        });
    },
    render: function (data) {

        var x = [];
        var y = [];
        for (var i = 0; i < data.length; i++) {
            x.push(data[i].jobtime);
            y.push(data[i].count);
        }

        var dom = document.getElementById("myChart");
        var myChart = echarts.init(dom);
        var option = {
            xAxis: {
                type: 'category',
                data: x
            },
            yAxis: {
                type: 'value'
            },
            series: [{
                data: y,
                type: 'line'
            }]
        };

        if (option && typeof option === "object") {
            myChart.setOption(option, true);
        }

    }
};