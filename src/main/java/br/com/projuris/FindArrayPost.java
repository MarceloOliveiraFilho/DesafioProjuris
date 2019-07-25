package br.com.projuris;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindArrayPost {
	private MyFindArray find;

	public FindArrayPost() {
		find = new MyFindArray();
	}

	@RequestMapping(value="/exercicio1", method = RequestMethod.POST)
	public ResponseEntity<Integer> buscaSubArray(@RequestBody FindArrayBody body) {
		return new ResponseEntity<Integer>(find.findArray(body.getArray(), body.getSubArray()), HttpStatus.OK);
	}
}
