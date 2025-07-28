import Annuaire from "./Annuaire.js";
const addModal = document.getElementById("add-modal");
const detailsModal = document.getElementById("details-modal");
const contactList = document.getElementById("contacts-list");
const addForm = document.getElementById("add-contact-form");
const addButton = document.getElementById("add-contact-btn");
const closeAdd = document.getElementById("close-add-modal");
const closeDetails = document.getElementById("close-details-modal");
let newAnnuaire = new Annuaire;
function afficherContact() {
    contactList.innerHTML = ""; // reset
    annuaire.contacts.forEach((contact, index) => {
        const btn = document.createElement("button");
        btn.textContent = `${contact["firstName"]} ${contact["lastName"]}`;
        btn.addEventListener("click", () => openDetailsModal(contact));
        contactList.appendChild(btn);
    });
}
