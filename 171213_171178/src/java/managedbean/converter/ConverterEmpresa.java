/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean.converter;

/**
 *
 * @author glauc
 */


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelo.Empresa;
import servico.EmpresaService;




@FacesConverter("converterEmpresa")
public class ConverterEmpresa implements Converter {

	private EmpresaService servico = new EmpresaService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Empresa e=null;
		if(value != null && !value.equals("")) {
			e = servico.getEmpresaByNome(value);	
		}
		
		
		
		return e;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object empresa) {
		if (empresa == null || empresa.equals("")) {
			return null;
		} else {
			return ((Empresa) empresa).getNome();

		}
	}

}
