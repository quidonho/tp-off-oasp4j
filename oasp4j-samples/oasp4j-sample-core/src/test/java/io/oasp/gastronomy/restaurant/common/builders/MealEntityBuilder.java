package io.oasp.gastronomy.restaurant.common.builders;

import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.MealEntity;

import java.util.LinkedList;
import java.util.List;

public class MealEntityBuilder {

  private List<P<MealEntity>> parameterToBeApplied;

  public MealEntityBuilder() {

    parameterToBeApplied = new LinkedList<P<MealEntity>>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  public MealEntityBuilder pictureId(final Long pictureId) {

    parameterToBeApplied.add(new P<MealEntity>() {
      @Override
      public void apply(MealEntity target) {

        target.setPictureId(pictureId);
      }
    });
    return this;
  }

  public MealEntityBuilder name(final String name) {

    parameterToBeApplied.add(new P<MealEntity>() {
      @Override
      public void apply(MealEntity target) {

        target.setName(name);
      }
    });
    return this;
  }

  public MealEntityBuilder description(final String description) {

    parameterToBeApplied.add(new P<MealEntity>() {
      @Override
      public void apply(MealEntity target) {

        target.setDescription(description);
      }
    });
    return this;
  }

  public MealEntityBuilder revision(final Number revision) {

    parameterToBeApplied.add(new P<MealEntity>() {
      @Override
      public void apply(MealEntity target) {

        target.setRevision(revision);
      }
    });
    return this;
  }

  public MealEntity createNew() {

    MealEntity mealentity = new MealEntity();
    for (P<MealEntity> parameter : parameterToBeApplied) {
      parameter.apply(mealentity);
    }
    return mealentity;
  }

  /**
   * Might be enrichted to users needs (will not be overwritten)
   */
  private void fillMandatoryFields_custom() {

  }

  /**
   * Fills all mandatory fields by default. (will be overwritten on re-generation)
   */
  private void fillMandatoryFields() {

  }

}
