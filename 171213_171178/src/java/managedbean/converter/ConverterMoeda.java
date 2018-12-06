package Managedbean.converter;



import Modelo.Moeda;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import Servico.MoedaService;




@FacesConverter("converterMoeda")
public class ConverterMoeda implements Converter {

	private MoedaService servico = new MoedaService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Moeda e=null;
		if(value != null && !value.equals("")) {
			e = servico.getMoedaByNome(value);
		}
		
		
		
		return e;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object moeda) {
		if (moeda == null || moeda.equals("")) {
			return null;
		} else {
			return ((Moeda) moeda).getNome();

		}
	}

}
