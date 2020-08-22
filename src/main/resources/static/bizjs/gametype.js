$(function () {
    GameType.getData();
});
var GameType = {
    getData: function () {
        $.ajax({
            url: "/gameType/getGameType",
            type: "get",
            dataType: "json",
            success: function (data1) {
                GameType.renderChart(data1);
            }
        });
    },
    renderChart: function(data1) {

        var data = [];
        var x_label = [];
        for (var i = 0; i < data1.length; i++) {
            data.push(data1[i].num);
            x_label.push(data1[i].type);
        }
        var cw = document.getElementById("chart-wrap");
        cw.innerHTML = "";
        var max = 150;
        var percent = 420 / max;
        var i = 0;
        for (var index in data) {
            var bar = document.createElement("div");
            bar.id = index + "_" + data[index];
            bar.style.height = Math.round(percent * data[index]) + "px";
            bar.style.width = "30px";
            bar.style.left = (i * 37) + 40 + "px";
            bar.style.marginLeft = (i * 20) + "px";
            bar.style.position = "absolute";
            if (data[index] <= 30) bar.style.background = "none repeat scroll 0 0 khaki";
            else if (data[index] <= 60) bar.style.background = "none repeat scroll 0 0 tan";
            else if (data[index] <= 90) bar.style.background = "none repeat scroll 0 0 rosybrown";
            else if (data[index] <= 120) bar.style.background = "none repeat scroll 0 0 saddlebrown";
            else bar.style.background = "none repeat scroll 0 0 brown";
            bar.style.overflow = "hidden";
            bar.setAttribute("title", index + "：" + data[index]);
            bar.style.display = "block";
            bar.style.top = 450 - Math.round(percent * data[index]) + "px";
            cw.appendChild(bar);
            var axis = document.createElement("div");
            axis.id = "axis_" + i;
            axis.style.width = "40px";
            axis.style.left = (i * 37) + 35 + "px";
            axis.style.marginLeft = (i * 20) + "px";
            axis.style.textAlign = "center";
            axis.style.position = "absolute";
            axis.style.top = "460px";
            axis.innerHTML = '<span style="font-size:12px; color:grey;"> ' + x_label[i] + '</span>';
            cw.appendChild(axis);
            i++;
        }
        for (var i = 0; i < 15; i++) {
            var ayis = document.createElement("div");
            ayis.style.width = "30px";
            ayis.style.position = "absolute";
            ayis.style.top = (28 * i) + (30 - 12) + "px";
            ayis.style.left = "10px";
            ayis.innerHTML = '<span style="font-size:12px; color:grey;"> ' + Math.round(max - (max / 15) * i) + '</span>';
            cw.appendChild(ayis);
            var line = document.createElement("div");
            line.setAttribute("style", "width:680px; left:35px; border-top:1px dotted grey; height:1px; line-height:1px; display:block; overflow:hidden; position:absolute; ");
            line.style.top = (28 * i) + 30 + "px";
            cw.appendChild(line);
        }
    }
};