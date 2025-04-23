# 📋 Documentación del Componente: **Cliente**

## Descripción General

El componente **`cliente.component.html`** se encarga de recopilar los datos de un cliente en una interfaz sencilla y clara, utilizando el framework **Ionic**. Este componente se integra dentro de la aplicación para permitir la introducción de información de contacto básica como **nombre**, **teléfono** y **correo electrónico**.

El componente se muestra como una tarjeta (`ion-card`), que incluye tres campos de entrada (`ion-input`), con etiquetas flotantes (`ion-label`) para mejorar la experiencia visual y la usabilidad en dispositivos móviles.

Este archivo es una parte esencial de la interfaz de usuario (UI) en flujos como el registro de un cliente, la creación de una nueva reserva, o el perfil del cliente.

---

## Estructura y Detalles del Componente

```html
<ion-card>
  <ion-card-header>
    <ion-card-title>Datos del Cliente</ion-card-title>
  </ion-card-header>
  <ion-card-content>
    <ion-item>
      <ion-label position="floating">Nombre</ion-label>
      <ion-input type="text"></ion-input>
    </ion-item>
    <ion-item>
      <ion-label position="floating">Teléfono</ion-label>
      <ion-input type="tel"></ion-input>
    </ion-item>
    <ion-item>
      <ion-label position="floating">Correo electrónico</ion-label>
      <ion-input type="email"></ion-input>
    </ion-item>
  </ion-card-content>
</ion-card>
