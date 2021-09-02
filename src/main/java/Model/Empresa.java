package Model;

public class Empresa {

	public String NombreEmpresa;
	public String Sucursal;
	public int CodigoPostal;
	public String Colonia;
	public String Calle;
	public int NumDomicilio;
	public int NumDomPart;
	public String Municipio;
	public String Ciudad;
	public String Provincia;
	public int Telefono;
	public String PaginaWeb;
	
	public void setNombreEmpresa(String NombreEmpresa) {
		this.NombreEmpresa = NombreEmpresa;
	}
	public void setSucursal(String Sucursal) {
		this.Sucursal = Sucursal;
	}
	public void setCodigoPostal(int CodigoPostal) {
		this.CodigoPostal = CodigoPostal;
	}
	public void setColonia(String Colonia) {
		this.Colonia = Colonia;
	}
	public void setCalle(String Calle) {
		this.Calle = Calle;
	}
	public void setNumDomicilio(int NumDomicilio) {
		this.NumDomicilio = NumDomicilio;
	}
	public void setNumDomPart(int NumDomPart) {
		this.NumDomPart = NumDomPart;
	}
	public void setMunicipio(String Municipio) {
		this.Municipio = Municipio;
	}
	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
	}
	public void setProvincia(String Provincia) {
		this.Provincia = Provincia;
	}
	public void setTelefono(int Telefono) {
		this.Telefono = Telefono;
	}
	public void setPaginaWeb(String PaginaWeb) {
		this.PaginaWeb = PaginaWeb;
	}
	public String getNombreEmpresa(){return NombreEmpresa;}
	public String getSucursal(){return Sucursal;}
	public int getCodigoPostal(){return CodigoPostal;}
	public String getColonia(){return Colonia;}
	public String getCalle(){return Calle;}
	public int getNumDomicilio(){return NumDomicilio;}
	public int getNumDomPart(){return NumDomPart;}
	public String getMunicipio(){return Municipio;}
	public String getCiudad(){return Ciudad;}
	public String getProvincia(){return Provincia;}
	public int getTelefono(){return Telefono;}
	public String getPaginaWeb(){return PaginaWeb;}
	
}
