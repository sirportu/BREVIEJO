package com.relative.brecreditosnuevos.objetosnegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class XmlDescuentosNuevaOperacion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("DescuentosOperacion")
	private com.relative.brecreditosnuevos.objetosnegocio.DescuentosOperacion DescuentosOperacion;

	public XmlDescuentosNuevaOperacion() {
	}

	public com.relative.brecreditosnuevos.objetosnegocio.DescuentosOperacion getDescuentosOperacion() {
		return this.DescuentosOperacion;
	}

	public void setDescuentosOperacion(
			com.relative.brecreditosnuevos.objetosnegocio.DescuentosOperacion descuentosOperacion) {
		this.DescuentosOperacion = descuentosOperacion;
	}

	public XmlDescuentosNuevaOperacion(
			com.relative.brecreditosnuevos.objetosnegocio.DescuentosOperacion descuentosOperacion) {
		this.DescuentosOperacion = descuentosOperacion;
	}

}