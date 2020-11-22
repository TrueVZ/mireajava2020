package ru.mirea.lab24.task3.document;

public interface CreateDocument {
    IDocument createNew();
    IDocument createOpen(IDocument iDocument);
}
