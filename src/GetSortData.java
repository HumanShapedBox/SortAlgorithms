public interface GetSortData {
    // короче, делаешь абстрактный Сортс, у него гора наследников, у всех метод возвращения времени, количества операций и названия сортировки
    // ну а дальше переписываешь свою дичь уже в нормальном виде
    String sortName();
    int getCounter();
    long getTimer();
    void doSort(int[] array);
}
