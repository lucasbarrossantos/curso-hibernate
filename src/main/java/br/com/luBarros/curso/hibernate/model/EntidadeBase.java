package br.com.luBarros.curso.hibernate.model;


import java.io.Serializable;

public abstract class EntidadeBase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPersisted() {
        return id != null && id > 0;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}