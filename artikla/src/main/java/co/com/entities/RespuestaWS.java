package co.com.entities;

public class RespuestaWS {
	/*================= MENSAJES DE RESPUESTA DEL WS =========================*/
	public static RespWS errorGuardarUsuario = new RespWS(IRespWS.ERROR_GUARDAR_USUARIO, "Se ha presentado un inconveniente en el registro. Intenta nuevamente");
	public static RespWS usuarioRegistrado = new RespWS(IRespWS.USUARIO_REGISTRADO, "Usuario registrado exitosamente");
}