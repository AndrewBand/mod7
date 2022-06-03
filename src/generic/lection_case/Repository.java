package generic.lection_case;

public interface Repository<D, M> {
    void save (D key, M value);

    D getKey();
    M getValue();

}
