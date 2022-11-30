package org.example;

import junit.framework.TestCase;
import org.dbunit.dataset.IDataSet;
import org.junit.Test;

public class ContactTest extends TestCase {

    @Test
    public void testSelectAllContacts() {

    }

    @Test
    public void testInsertContact() {
        Contact contact = new Contact("eunice", "scintich", "0620913691");
        contact.insertContact(contact.getNom(), contact.getPrenom(), contact.getNumTel());

    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }
}