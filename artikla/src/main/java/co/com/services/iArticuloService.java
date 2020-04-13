/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.services;


import co.com.entities.Articulo;
import co.com.negocio.ArticuloDto;
import java.util.List;

/**
 *
 * @author Usuario
 */
 public interface iArticuloService {
        List<Articulo> findAll();
        List<Articulo> listarById(final Long idUsuario);
        Articulo agregarArticuloDto(final ArticuloDto articulo );
        Articulo editarArticulo(final Long idArticulo, final Long idUsuario);
        Articulo eliminarArticulo(final Long idArticulo, Long idUsuario);
}
