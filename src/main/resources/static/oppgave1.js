$("#temp").click(function temp(){
    let month = document.getElementById("month").value;

    let url = "temp?month=" + month

/*  Eksempel på hvordan man kan bruke fetch til å hente data fra serveren
    Dette er ikke pensum, men kan være nyttig å vite om til senere
    fetch(url, {
        method: "GET"
    })
        .then(response => response.text())
        .then(data => {
            let temp = "Temperaturen i " + monthName.toLowerCase() + " er " + data + " grader C.";

            document.getElementById("result").innerHTML = temp;
        })

*/
    //Henter temperatur fra serveren ved å bruke jquery
    $.get(url, function(data){
        let temp = "Temperaturen i " + month.toLowerCase() + " er " + data + " grader C."

        $("#result").html(temp);
    })

})