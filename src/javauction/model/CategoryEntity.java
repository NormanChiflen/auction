package javauction.model;

import javax.persistence.*;

/**
 * Created by jimouris on 7/2/16.
 */
@Entity
@Table(name = "category", schema = "auctionwebsite", catalog = "")
public class CategoryEntity {
    private int categoryId;
    private String categoryName;

    @Id
    @Column(name = "CategoryID")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "CategoryName")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}