# Componente de Selección de Fecha y Hora

## Descripción

Este componente permite al usuario seleccionar una fecha y una hora utilizando los elementos de la interfaz de usuario de Ionic. Está compuesto por dos campos de selección: uno para la fecha y otro para la hora. Ambos campos utilizan el componente `ion-datetime` de Ionic para proporcionar una interfaz fácil de usar y accesible para elegir la fecha y la hora.

## Estructura del Componente

El componente está estructurado como un `ion-card` que contiene:

1. **Encabezado del Card:**
   - Título: *"Seleccionar Fecha y Hora"*

2. **Contenido del Card:**
   - **Fecha:**
     - Se utiliza un `ion-item` con un `ion-label` que contiene la palabra "Fecha".
     - Un `ion-datetime` con la propiedad `presentation="date"`, que permite seleccionar una fecha del calendario.
   
   - **Hora:**
     - Se utiliza un `ion-item` con un `ion-label` que contiene la palabra "Hora".
     - Un `ion-datetime` con la propiedad `presentation="time"`, que permite seleccionar una hora del reloj.

## Funcionamiento

El componente permite al usuario seleccionar:

- **Fecha:** Al hacer clic en el campo de fecha, se abre un calendario para elegir un día específico.
- **Hora:** Al hacer clic en el campo de hora, se abre un selector de hora para elegir un momento específico del día.

Ambos campos permiten una entrada sencilla y visualmente amigable para seleccionar fecha y hora de manera independiente.

## Código

```html
<!-- fecha.component.html -->
<ion-card>
  <ion-card-header>
    <ion-card-title>Seleccionar Fecha y Hora</ion-card-title>
  </ion-card-header>
  <ion-card-content>
    <ion-item>
      <ion-label>Fecha</ion-label>
      <ion-datetime presentation="date"></ion-datetime>
    </ion-item>
    <ion-item>
      <ion-label>Hora</ion-label>
      <ion-datetime presentation="time"></ion-datetime>
    </ion-item>
  </ion-card-content>
</ion-card>
