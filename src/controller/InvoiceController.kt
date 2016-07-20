package controller

import controller.interfaces.AbnVerifier
import controller.interfaces.ViewChanger
import tornadofx.Controller

class InvoiceController : ViewChanger, AbnVerifier, Controller() {
}