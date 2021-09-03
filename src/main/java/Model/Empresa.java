package Model;

public class Empresa {

	public String nombreEmpresa;
	public String sucursal;
	public int codigoPostal;
	public String colonia;
	public String calle;
	public int numDomicilio;
	public int numDomPart;
	public String municipio;
	public String ciudad;
	public String provincia;
	public int telefono;
	public String paginaWeb;
	
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setNumDomicilio(int numDomicilio) {
		this.numDomicilio = numDomicilio;
	}
	public void setNumDomPart(int numDomPart) {
		this.numDomPart = numDomPart;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	public String getNombreEmpresa(){return nombreEmpresa;}
	public String getSucursal(){return sucursal;}
	public int getCodigoPostal(){return codigoPostal;}
	public String getColonia(){return colonia;}
	public String getCalle(){return calle;}
	public int getNumDomicilio(){return numDomicilio;}
	public int getNumDomPart(){return numDomPart;}
	public String getMunicipio(){return municipio;}
	public String getCiudad(){return ciudad;}
	public String getProvincia(){return provincia;}
	public int getTelefono(){return telefono;}
	public String getPaginaWeb(){return paginaWeb;}
	
}
