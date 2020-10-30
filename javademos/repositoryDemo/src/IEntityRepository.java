public interface IEntityRepository<T extends IEntity > {
    void add(T entity);           //entity genelde veri tabanı nesnesi anlamına gelir.
    void delete(T entity);
    void update(T entity);
    // yukarıda extends yerine implement kullanamazsın.
}
