document.getElementById("cta-button").addEventListener("click", function() {
    alert("Obrigado pelo seu interesse! Em breve, você terá mais informações.");
});

document.getElementById("contato-form").addEventListener("submit", function(event) {
    event.preventDefault();
    alert("Mensagem enviada com sucesso!");
});
