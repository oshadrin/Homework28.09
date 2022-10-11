public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = name;
        }    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }    }


    public Human(int yearOfBirth, String town, String job, int yearOfBirth1, String name, String town1, String job1) {
        this.yearOfBirth = yearOfBirth1;
        this.name = name;
        this.town = town1;
        this.job = job1;
        this.setYearOfBirth(yearOfBirth);
        this.setName(this.name);
        this.setJob(job);
        this.setTown(town);
    }
}
