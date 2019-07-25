package br.com.projuris;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindCharachterPost {
	private MyFindChar find;
	
	public FindCharachterPost() {
		find = new MyFindChar();
	}
	
	@RequestMapping(value="/exercicio2", method = RequestMethod.POST)
	public ResponseEntity<String> buscaSubArray(@RequestBody FindCharBody body) {
		return new ResponseEntity<>(find.findChar(body.getPalavra()), HttpStatus.OK);
	}
}
