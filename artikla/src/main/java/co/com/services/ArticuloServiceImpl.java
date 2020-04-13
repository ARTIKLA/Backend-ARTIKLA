/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.services;

import co.com.entities.Articulo;
import co.com.negocio.ArticuloDto;
import co.com.repositories.ArticuloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Usuario
 */
public class ArticuloServiceImpl implements iArticuloService {

    @Autowired
    ArticuloRepository articuloRepository;
    
    
    
    @Override
    public List<Articulo> listarById(final Long idUsuario) {
       return articuloRepository.findAllById(idUsuario);
    }

    @Override
    public Articulo agregarArticuloDto(final ArticuloDto articuloDto) {
        Articulo articulo = new Articulo();
        articulo.setTitulo(articuloDto.getTitulo());
        articulo.setDescripcion(articuloDto.getDescripcion());
        
      return  articuloRepository.save(articulo);
    }

    @Override
    public Articulo editarArticulo(Long idArticulo, Long idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Articulo eliminarArticulo(Long idArticulo, Long idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Articulo> findAll() {
        return articuloRepository.findAll();
    }
    
}
