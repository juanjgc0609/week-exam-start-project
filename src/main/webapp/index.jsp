<html>
<body>
<h1>Gestión de Avistamientos y Expediciones</h1>
<h2>Registrar Expediciones</h2>
<form action="expeditions" method="POST">
    <input
            name="id"
            type="text"
            placeholder="Identificador">
    <input
        name="name"
        type="text"
        placeholder="nombre">
    <input
            name="code"
            type="text"
            placeholder="A00407891">
    <input
            name="Region"
            type="text"
            placeholder="Ejemplo: Amazonia">
    <input
            name="baseCamp"
            type="text"
            placeholder="lugar">
    <input
            name="leader"
            type="text"
            placeholder="lider">
    <input
            name="startDate"
            type="text"
            placeholder="fecha de inicio">
    <input
            name="endDate"
            type="text"
            placeholder="fecha de fin">
    <input
            name="estate"
            type="text"
            placeholder="Ejemplo: Activo">
    <button>Enviar</button>

</form>
<h2>Registrar Avistamientos</h2>
<form action="sightings" method="POST">
    <input
            name="id"
            type="text"
            placeholder="Identificador">
    <input
            name="sightingCode"
            type="text"
            placeholder="20261975">
    <input
            name="name"
            type="text"
            placeholder="nombre">
    <input
            name="description"
            type="text"
            placeholder="descripcion">
    <input
            name="scientificName"
            type="text"
            placeholder="Nombre cientifico">
    <input
            name="sightedAt"
            type="text"
            placeholder="fecha y hora">
    <input
            name="Location"
            type="text"
            placeholder="lugar">
    <input
            name="quantity"
            type="text"
            placeholder="cantidad de elementos">
    <input
            name="confidenceLevel"
            type="text"
            placeholder="nivel de confianza">
    <input
            name="expeditionId"
            type="text"
            placeholder="Id expedition">
    <button>Enviar</button>


</form>

</body>
</html>
