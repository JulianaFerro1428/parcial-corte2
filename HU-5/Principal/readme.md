# Componente de Gestión de Reservas

El **Componente de Gestión de Reservas** es una parte fundamental de la interfaz de usuario para la gestión de reservas en un restaurante. Este componente permite a los usuarios navegar a diferentes secciones para ingresar información como el **cliente**, la **fecha** de la reserva y la **mesa** seleccionada.

## Estructura del Componente

Este componente está compuesto por un **header** con herramientas de navegación y una imagen que se muestra entre el header y el contenido principal.

A continuación, se describe la estructura completa del componente:

```html
<ion-header>
  <ion-toolbar color="primary">
    <ion-title>Gestión de Reservas</ion-title>
  </ion-toolbar>

  <ion-toolbar color="light">
    <ion-grid>
      <ion-row>
        <ion-col size="4" (click)="navigateTo('cliente')" class="cursor-pointer">
          <div class="d-flex align-items-center justify-content-center">
            <ion-icon name="person-circle" class="mr-2"></ion-icon>
            <span>Cliente</span>
          </div>
        </ion-col>
        <ion-col size="4" (click)="navigateTo('fecha')" class="cursor-pointer">
          <div class="d-flex align-items-center justify-content-center">
            <ion-icon name="calendar" class="mr-2"></ion-icon>
            <span>Fecha Reserva</span>
          </div>
        </ion-col>
        <ion-col size="4" (click)="navigateTo('mesa')" class="cursor-pointer">
          <div class="d-flex align-items-center justify-content-center">
            <ion-icon name="restaurant" class="mr-2"></ion-icon>
            <span>Escoger Mesa</span>
          </div>
        </ion-col>
      </ion-row>
    </ion-grid>
  </ion-toolbar>
</ion-header>

<!-- Imagen colocada entre el header y el contenido -->
<div class="restaurant-image-container">
  <img src="https://img.freepik.com/free-photo/restaurant-interior_1127-3394.jpg" alt="Restaurante lujoso" class="restaurant-image">
</div>
