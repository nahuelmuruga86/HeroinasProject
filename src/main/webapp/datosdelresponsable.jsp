<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/stylealex.css">
<title>Datos del Responsable</title>
</head>
<body>
	<div class="Elbori">
		<form class="row g-3" id="formddr" onsubmit="return validar();">

			<p class="pddr">Datos personales</p>

			<div class="col-md-6">
				<label for="completname" class="form-label">Nombre completo</label>
				<input type="text" maxlength="30" class="form-control"
					id="completname" placeholder="Nombre completo" required>
			</div>

			<div class="col-md-5">
				<label for="stall" class="form-label">Puesto</label> <select
					class="form-select" id="stall" required>
					<option selected disabled value="">Puesto...</option>
					<option>...</option>
				</select>
			</div>

			<div class="col-md-6">
				<label for="area" class="form-label">Área</label> <input type="text"
					maxlength="30" class="form-control" id="area" placeholder="Área"
					required>
			</div>

			<div class="col-md-5">
				<label for="direction" class="form-label">Dirección</label> <select
					class="form-select" id="direction" required>
					<option selected disabled value="">Dirección...</option>
					<option>...</option>
				</select>
			</div>

			<p class="pddr">Fecha de cumpleaños</p>

			<div class="col-md-3">
				<label for="day" class="form-label">Dia</label> <select
					class="form-select" id="day" required>
					<option selected disabled value="">Dia...</option>
					<option value="1">01</option>
					<option value="2">02</option>
					<option value="3">03</option>
					<option value="4">04</option>
					<option value="5">05</option>
					<option value="6">06</option>
					<option value="7">07</option>
					<option value="8">08</option>
					<option value="9">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select>
			</div>

			<div class="col-md-3">
				<label for="month" class="form-label">Mes</label> <select
					class="form-select" id="month" required>
					<option selected disabled value="">Mes...</option>
					<option value="1">enero</option>
					<option value="2">febrero</option>
					<option value="3">marzo</option>
					<option value="4">abril</option>
					<option value="5">mayo</option>
					<option value="6">junio</option>
					<option value="7">julio</option>
					<option value="8">agosto</option>
					<option value="9">septiembre</option>
					<option value="10">octubre</option>
					<option value="11">noviembre</option>
					<option value="12">diciembre</option>
				</select>
			</div>

			<div class="col-md-3">
				<label for="year" class="form-label">Año</label> <select
					class="form-select" id="year" required>
					<option selected disabled value="">Año...</option>
					<option value="2021">2021</option>
					<option value="2020">2020</option>
					<option value="2019">2019</option>
					<option value="2018">2018</option>
					<option value="2017">2017</option>
					<option value="2016">2016</option>
					<option value="2015">2015</option>
					<option value="2014">2014</option>
					<option value="2013">2013</option>
					<option value="2012">2012</option>
					<option value="2011">2011</option>
					<option value="2010">2010</option>
					<option value="2009">2009</option>
					<option value="2008">2008</option>
					<option value="2007">2007</option>
					<option value="2006">2006</option>
					<option value="2005">2005</option>
					<option value="2004">2004</option>
					<option value="2003">2003</option>
					<option value="2002">2002</option>
					<option value="2001">2001</option>
					<option value="2000">2000</option>
					<option value="1999">1999</option>
					<option value="1998">1998</option>
					<option value="1997">1997</option>
					<option value="1996">1996</option>
					<option value="1995">1995</option>
					<option value="1994">1994</option>
					<option value="1993">1993</option>
					<option value="1992">1992</option>
					<option value="1991">1991</option>
					<option value="1990">1990</option>
					<option value="1989">1989</option>
					<option value="1988">1988</option>
					<option value="1987">1987</option>
					<option value="1986">1986</option>
					<option value="1985">1985</option>
					<option value="1984">1984</option>
					<option value="1983">1983</option>
					<option value="1982">1982</option>
					<option value="1981">1981</option>
					<option value="1980">1980</option>
					<option value="1979">1979</option>
					<option value="1978">1978</option>
					<option value="1977">1977</option>
					<option value="1976">1976</option>
					<option value="1975">1975</option>
					<option value="1974">1974</option>
					<option value="1973">1973</option>
					<option value="1972">1972</option>
					<option value="1971">1971</option>
					<option value="1970">1970</option>
					<option value="1969">1969</option>
					<option value="1968">1968</option>
					<option value="1967">1967</option>
					<option value="1966">1966</option>
					<option value="1965">1965</option>
					<option value="1964">1964</option>
					<option value="1963">1963</option>
					<option value="1962">1962</option>
					<option value="1961">1961</option>
					<option value="1960">1960</option>
				</select>
			</div>

			<p class="pddr">Contacto</p>

			<div class="col-md-5">
				<label for="email" class="form-label">Correo</label> <input
					type="email" maxlength="35" class="form-control" id="email"
					placeholder="Correo" required>
			</div>

			<div class="col-md-5">
				<label for="cellphone" class="form-label">No.Celular</label> <input
					type="number" maxlength="20" class="form-control" id="cellphone"
					placeholder="No.Celular" required>
			</div>

			<input type="submit" onclick="validarFecha();" value="Siguiente">

		</form>

		<footer>
			<iframe src="footer.html"></iframe>
		</footer>

	</div>

	<script>src="valiacionddr.js"</script>
</body>
</html>