package com.example.myapp

class Contact(
    var name: String,
    var phone: String,
    var email: String) {

    override fun toString(): String {
        return "Nome: ${this.name} | Telefone:  ${this.phone} | Email:  ${this.email}"
    }
}