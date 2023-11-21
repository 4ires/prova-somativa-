package com.projetosoma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cursos")
public class Curso {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private String nome;
		private double cargaHoraria;
		private String conteudoProgramatico;
		private double valor;
		private String professor;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getCargaHoraria() {
			return cargaHoraria;
		}

		public void setCargaHoraria(double cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}

		public String getConteudoProgramatico() {
			return conteudoProgramatico;
		}

		public void setConteudoProgramatico(String conteudoProgramatico) {
			this.conteudoProgramatico = conteudoProgramatico;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getProfessor() {
			return professor;
		}

		public void setProfessor(String professor) {
			this.professor = professor;
		}

		
		
}
