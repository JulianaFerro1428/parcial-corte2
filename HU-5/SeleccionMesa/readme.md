# Componente de Selección de Mesa

El **Componente de Selección de Mesa** permite a los usuarios seleccionar una mesa disponible de una lista de opciones predefinidas. Este componente es parte de una aplicación de gestión de reservas para un restaurante y proporciona una forma sencilla y visual de seleccionar entre varias mesas disponibles.

## Estructura del Componente

El código HTML del componente está basado en el framework **Ionic**, que proporciona elementos visuales interactivos y móviles para aplicaciones web. A continuación, se describe la estructura de este componente:

```html
<!-- mesa.component.html -->
<ion-card>
  <ion-card-header>
    <ion-card-title>Seleccionar Mesa</ion-card-title>
  </ion-card-header>
  <ion-card-content>
    <ion-item>
      <ion-label>Mesas Disponibles</ion-label>
      <ion-select placeholder="Selecciona una mesa">
        <ion-select-option value="1">Mesa 1</ion-select-option>
        <ion-select-option value="2">Mesa 2</ion-select-option>
        <ion-select-option value="3">Mesa 3</ion-select-option>
        <ion-select-option value="4">Mesa 4</ion-select-option>
      </ion-select>
    </ion-item>
  </ion-card-content>
</ion-card>
