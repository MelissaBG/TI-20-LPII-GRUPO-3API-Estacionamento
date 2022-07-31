package br.com.lp2.fundatec.TI20LP2APIestacionamento.exception;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ErroResponseDTO;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    	extends ResponseEntityExceptionHandler {

        @ExceptionHandler(BadRequestException.class)
        public ResponseEntity<ErroResponseDTO> handleBadRequestException(
                BadRequestException exception) {
            ErroResponseDTO erro = new ErroResponseDTO(exception.getMensagem());
            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }

        @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
        public ResponseEntity<ErroResponseDTO> handleNotFoundException(
                NotFoundExceptionexception) {
            ErroResponseDTO erro = new ErroResponseDTO(exception.getMensagem());
            return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
        }

    }
