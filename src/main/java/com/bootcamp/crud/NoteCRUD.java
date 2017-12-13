package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Note;
import com.bootcamp.repositories.NoteRepository;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class NoteCRUD implements DatabaseConstants {

    /* Crud for note */

    public static boolean create(Note note) throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.create(note);
    }

    public static boolean update(Note note) throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.update(note);
    }


    public static boolean delete(Note note) throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return  noteRepository.delete(note);

    }

    public static List<Note> read(Criterias criterias) {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias);
    }

    public static List<Note> read(Criterias criterias, int page, int size) {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Note> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Note> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Note> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(fields);
    }

    public static List<Note> read() throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.findAll();
    }
}
