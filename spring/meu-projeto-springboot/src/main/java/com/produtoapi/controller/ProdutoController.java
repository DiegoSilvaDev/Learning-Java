package com.produtoapi.controller;

import com.produtoapi.model.Produto;
import com.produtoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produtos") // http://localhost:8080/produtos
public class ProdutoController {
    private ProdutoService produtoService;

    @Autowired
    public void setService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarTodos(){
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return produtoService.inserir(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }

    @DeleteMapping
    public void deletarTudo() {
        produtoService.deletarTudo();
    }

    @GetMapping("/{id}")
    public Optional<Produto> findById(@PathVariable Long id){
        return produtoService.findById(id);
    }

    @PostMapping("/salvarLista")
    public List<Produto> salvarLista(@RequestBody List<Produto> produtos) {
        return produtoService.salvarLista(produtos);
    }
    
    @GetMapping("/buscarPorNome")
    public List<Produto> buscarPorNome(@RequestParam String valor){
        return produtoService.findByNome(valor);
    }

    // Endpoint de buscas detalhadas
    @GetMapping("/buscarPorNomeContendo")
    public List<Produto> buscarPorNomeContendo(@RequestParam String valor){
        return produtoService.findByNomeContaining(valor);
    }

    @GetMapping("/buscarPorNomeEStatus")
    public List<Produto> buscarPorNomeEStatus(@RequestParam String nome, @RequestParam String status ){
        return produtoService.findByNomeAndStatus(nome, status);
    }

    @GetMapping("/buscarPorNomeComecandoCom")
    public List<Produto> buscarPorNomeComecandoCom(@RequestParam String valor){
        return produtoService.findByNomeStartingWith(valor);
    }

    @GetMapping("/buscarPorNomeTerminandoCom")
    public List<Produto> buscarPorNomeTerminandoCom(@RequestParam String valor) {
        return produtoService.findByNomeEndingWith(valor);
    }
}
