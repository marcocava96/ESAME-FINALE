////////////// PRENDO POSSESSO DEGLI ELEMENTI HTML //////////////
let form = document.querySelector("form");
let label_cod_cliente = document.querySelector("#label_cod_cliente");

////////////// FETCH CLIENTI //////////////
fetch("http://localhost:8080/clienti/tutti")
  .then((RESPONSE) => RESPONSE.json())
  .then((CLIENTI) => {
    console.log(CLIENTI);

    //CREO arrCodClienti
    let arrCodClienti = [];

    //PUSHO TUTTI I cod_cliente DENTRO arrCodClienti
    CLIENTI.forEach((cliente) => {
      arrCodClienti.push(cliente.cod_cliente);
    });

    console.log(arrCodClienti);

    // EVENTLISTENER PER IL FORM
    form.addEventListener("submit", (event) => {
      //IMPEDISCO AL FORM DI PARTIRE
      event.preventDefault();

      //PRENDO POSSESSO DELL'INPUT con nome "cod_cliente"
      let inputCodCliente = form.elements["cod_cliente"].value;

      //ITERO arrCodClienti
      for (let i = 0; i < arrCodClienti.length; i++) {
        //SE TROVO UN MATCH con INPUT "cod_cliente" VADO IN PAGINA PRENOTAZIONE
        if (inputCodCliente == arrCodClienti[i]) {
          //SALVO IN LOCAL STORAGE
          const inputCodClienteLocalStorage = inputCodCliente;
          localStorage.setItem("cod_cliente", inputCodClienteLocalStorage);

          label_cod_cliente.innerHTML = `Codice cliente "${arrCodClienti[i]}" trovato!`;
          setTimeout(function () {
            // VADO IN PAGINA PRENOTAZIONE
            window.location.href = "../2_HOMEPAGE/2_homepage.html";
            // window.location.href = "../3_PRENOTAZIONE/3_prenotazione.html";
          }, 3000);
          return;
        } else {
          label_cod_cliente.innerHTML = "Codice cliente NON trovato!";
        }
      }
    });
  }) // FINE FETCH CLIENTI
  .catch((error) => {
    //GESTISCO EVENTUALI ERRORI
    console.error("Error:", error);
  });
