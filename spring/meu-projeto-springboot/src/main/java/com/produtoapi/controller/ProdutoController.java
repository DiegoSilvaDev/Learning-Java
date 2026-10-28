package com.produtoapi.controller;

import com.produtoapi.model.Produto;
import com.produtoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

}
