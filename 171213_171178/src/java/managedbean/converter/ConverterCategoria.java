/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managedbean.converter;

/**
 *
 * @author glauc
 */


import Modelo.Categoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import Servico.CategoriaService;




@FacesConverter("converterCategoria")
public class ConverterCategoria implements Converter {

	private CategoriaService servico = new CategoriaService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Categoria e=null;
		if(value != null && !value.equals("")) {
			e = servico.getCategoriaByDescricao(value);
		}
		
		
		
		return e;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object categoria) {
		if (categoria == null || categoria.equals("")) {
			return null;
		} else {
			return ((Categoria) categoria).getDescricao();

		}
	}

}
