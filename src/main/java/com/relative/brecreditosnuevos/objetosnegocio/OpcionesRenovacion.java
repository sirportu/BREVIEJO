package com.relative.brecreditosnuevos.objetosnegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OpcionesRenovacion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Opcion")
	private java.util.List<com.relative.brecreditosnuevos.objetosnegocio.Opcion> opcion;

	public OpcionesRenovacion() {
	}

	public java.util.List<com.relative.brecreditosnuevos.objetosnegocio.Opcion> getOpcion() {
		return this.opcion;
	}

	public void setOpcion(
			java.util.List<com.relative.brecreditosnuevos.objetosnegocio.Opcion> opcion) {
		this.opcion = opcion;
	}

	public OpcionesRenovacion(
			java.util.List<com.relative.brecreditosnuevos.objetosnegocio.Opcion> opcion) {
		this.opcion = opcion;
	}

}