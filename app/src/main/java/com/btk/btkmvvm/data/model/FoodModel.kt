package com.btk.btkmvvm.data.model
import com.google.gson.annotations.SerializedName

class FoodResponse : ArrayList<FoodModelItem>()

data class FoodModelItem(

    @SerializedName("abbreviated_product_name")
    val abbreviatedProductName: String?,
    @SerializedName("added_countries_tags")
    val addedCountriesTags: List<AddedCountriesTag>?,
    @SerializedName("additives_n")
    val additivesN: Int?,
    @SerializedName("additives_original_tags")
    val additivesOriginalTags: List<String>?,
    @SerializedName("additives_prev_original_tags")
    val additivesPrevOriginalTags: List<String>?,
    @SerializedName("additives_tags")
    val additivesTags: List<String>?,
    @SerializedName("allergens")
    val allergens: String?,
    @SerializedName("allergens_from_ingredients")
    val allergensFromIngredients: String?,
    @SerializedName("allergens_from_user")
    val allergensFromUser: String?,
    @SerializedName("allergens_hierarchy")
    val allergensHierarchy: List<String>?,
    @SerializedName("allergens_lc")
    val allergensLc: String?,
    @SerializedName("allergens_tags")
    val allergensTags: List<String>?,
    @SerializedName("amino_acids_prev_tags")
    val aminoAcidsPrevTags: List<AminoAcidsPrevTag>?,
    @SerializedName("amino_acids_tags")
    val aminoAcidsTags: List<AminoAcidsTag>?,
    @SerializedName("brands")
    val brands: String?,
    @SerializedName("brands_tags")
    val brandsTags: List<String>?,
    @SerializedName("carbon_footprint_percent_of_known_ingredients")
    val carbonFootprintPercentOfKnownIngredients: Int?,
    @SerializedName("categories")
    val categories: String?,
    @SerializedName("categories_hierarchy")
    val categoriesHierarchy: List<String>?,
    @SerializedName("categories_lc")
    val categoriesLc: String?,
    @SerializedName("categories_properties")
    val categoriesProperties: CategoriesProperties?,
    @SerializedName("categories_properties_tags")
    val categoriesPropertiesTags: List<String>?,
    @SerializedName("categories_tags")
    val categoriesTags: List<String>?,
    @SerializedName("category_properties")
    val categoryProperties: CategoryProperties?,
    @SerializedName("checked")
    val checked: String?,
    @SerializedName("checkers_tags")
    val checkersTags: List<String>?,
    @SerializedName("ciqual_food_name_tags")
    val ciqualFoodNameTags: List<String>?,
    @SerializedName("cities")
    val cities: String?,
    @SerializedName("cities_tags")
    val citiesTags: List<CitiesTag>?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("codes_tags")
    val codesTags: List<List<String>>?,
    @SerializedName("compared_to_category")
    val comparedToCategory: String?,
    @SerializedName("complete")
    val complete: Int?,
    @SerializedName("completeness")
    val completeness: Int?,
    @SerializedName("conservation_conditions")
    val conservationConditions: String?,
    @SerializedName("correctors_tags")
    val correctorsTags: List<String>?,
    @SerializedName("countries")
    val countries: String?,
    @SerializedName("countries_hierarchy")
    val countriesHierarchy: List<String>?,
    @SerializedName("countries_lc")
    val countriesLc: String?,
    @SerializedName("countries_tags")
    val countriesTags: List<String>?,
    @SerializedName("created_t")
    val createdT: Int?,
    @SerializedName("creator")
    val creator: String?,
    @SerializedName("customer_service")
    val customerService: String?,
    @SerializedName("data_quality_bugs_tags")
    val dataQualityBugsTags: List<DataQualityBugsTag>?,
    @SerializedName("data_quality_errors_tags")
    val dataQualityErrorsTags: List<DataQualityErrorsTag>?,
    @SerializedName("data_quality_info_tags")
    val dataQualityInfoTags: List<String>?,
    @SerializedName("data_quality_tags")
    val dataQualityTags: List<String>?,
    @SerializedName("data_quality_warnings_tags")
    val dataQualityWarningsTags: List<String>?,
    @SerializedName("data_sources")
    val dataSources: String?,
    @SerializedName("data_sources_tags")
    val dataSourcesTags: List<String>?,
    @SerializedName("ecoscore_data")
    val ecoscoreData: EcoscoreData?,
    @SerializedName("ecoscore_extended_data_version")
    val ecoscoreExtendedDataVersion: String?,
    @SerializedName("ecoscore_grade")
    val ecoscoreGrade: String?,
    @SerializedName("ecoscore_score")
    val ecoscoreScore: Int?,
    @SerializedName("ecoscore_tags")
    val ecoscoreTags: List<String>?,
    @SerializedName("editors_tags")
    val editorsTags: List<String>?,
    @SerializedName("emb_codes")
    val embCodes: String?,
    @SerializedName("emb_codes_orig")
    val embCodesOrig: String?,
    @SerializedName("emb_codes_tags")
    val embCodesTags: List<EmbCodesTag>?,
    @SerializedName("entry_dates_tags")
    val entryDatesTags: List<String>?,
    @SerializedName("environment_impact_level")
    val environmentImpactLevel: String?,
    @SerializedName("environment_impact_level_tags")
    val environmentImpactLevelTags: List<EnvironmentImpactLevelTag>?,
    @SerializedName("errors")
    val errors: List<Error>?,
    @SerializedName("expiration_date")
    val expirationDate: String?,
    @SerializedName("food_groups")
    val foodGroups: String?,
    @SerializedName("food_groups_tags")
    val foodGroupsTags: List<String>?,
    @SerializedName("fruits-vegetables-nuts_100g_estimate")
    val fruitsVegetablesNuts100gEstimate: Int?,
    @SerializedName("generic_name")
    val genericName: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image_front_small_url")
    val imageFrontSmallUrl: String?,
    @SerializedName("image_front_thumb_url")
    val imageFrontThumbUrl: String?,
    @SerializedName("image_front_url")
    val imageFrontUrl: String?,
    @SerializedName("image_nutrition_small_url")
    val imageNutritionSmallUrl: String?,
    @SerializedName("image_nutrition_thumb_url")
    val imageNutritionThumbUrl: String?,
    @SerializedName("image_nutrition_url")
    val imageNutritionUrl: String?,
    @SerializedName("image_small_url")
    val imageSmallUrl: String?,
    @SerializedName("image_thumb_url")
    val imageThumbUrl: String?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("images")
    val images: Images?,
    @SerializedName("informers_tags")
    val informersTags: List<String>?,
    @SerializedName("ingredients")
    val ingredients: List<Ingredient>?,
    @SerializedName("ingredients_analysis")
    val ingredientsAnalysis: IngredientsAnalysis?,
    @SerializedName("ingredients_analysis_tags")
    val ingredientsAnalysisTags: List<String>?,
    @SerializedName("ingredients_from_or_that_may_be_from_palm_oil_n")
    val ingredientsFromOrThatMayBeFromPalmOilN: Int?,
    @SerializedName("ingredients_from_palm_oil_n")
    val ingredientsFromPalmOilN: Int?,
    @SerializedName("ingredients_from_palm_oil_tags")
    val ingredientsFromPalmOilTags: List<IngredientsFromPalmOilTag>?,
    @SerializedName("ingredients_hierarchy")
    val ingredientsHierarchy: List<String>?,
    @SerializedName("ingredients_lc")
    val ingredientsLc: String?,
    @SerializedName("ingredients_n")
    val ingredientsN: Int?,
    @SerializedName("ingredients_n_tags")
    val ingredientsNTags: List<String>?,
    @SerializedName("ingredients_original_tags")
    val ingredientsOriginalTags: List<String>?,
    @SerializedName("ingredients_percent_analysis")
    val ingredientsPercentAnalysis: Int?,
    @SerializedName("ingredients_tags")
    val ingredientsTags: List<String>?,
    @SerializedName("ingredients_text")
    val ingredientsText: String?,
    @SerializedName("ingredients_text_with_allergens")
    val ingredientsTextWithAllergens: String?,
    @SerializedName("ingredients_that_may_be_from_palm_oil_n")
    val ingredientsThatMayBeFromPalmOilN: Int?,
    @SerializedName("ingredients_that_may_be_from_palm_oil_tags")
    val ingredientsThatMayBeFromPalmOilTags: List<IngredientsThatMayBeFromPalmOilTag>?,
    @SerializedName("ingredients_with_specified_percent_n")
    val ingredientsWithSpecifiedPercentN: Int?,
    @SerializedName("ingredients_with_specified_percent_sum")
    val ingredientsWithSpecifiedPercentSum: Int?,
    @SerializedName("ingredients_with_unspecified_percent_n")
    val ingredientsWithUnspecifiedPercentN: Int?,
    @SerializedName("ingredients_with_unspecified_percent_sum")
    val ingredientsWithUnspecifiedPercentSum: Int?,
    @SerializedName("interface_version_created")
    val interfaceVersionCreated: String?,
    @SerializedName("interface_version_modified")
    val interfaceVersionModified: String?,
    @SerializedName("knowledge_panels")
    val knowledgePanels: KnowledgePanels?,
    @SerializedName("known_ingredients_n")
    val knownIngredientsN: Int?,
    @SerializedName("labels")
    val labels: String?,
    @SerializedName("labels_hierarchy")
    val labelsHierarchy: List<String>?,
    @SerializedName("labels_lc")
    val labelsLc: String?,
    @SerializedName("labels_tags")
    val labelsTags: List<String>?,
    @SerializedName("lang")
    val lang: String?,
    @SerializedName("languages")
    val languages: Languages?,
    @SerializedName("languages_codes")
    val languagesCodes: LanguagesCodes?,
    @SerializedName("languages_hierarchy")
    val languagesHierarchy: List<String>?,
    @SerializedName("languages_tags")
    val languagesTags: List<String>?,
    @SerializedName("last_check_dates_tags")
    val lastCheckDatesTags: List<String>?,
    @SerializedName("last_checked_t")
    val lastCheckedT: Int?,
    @SerializedName("last_checker")
    val lastChecker: String?,
    @SerializedName("last_edit_dates_tags")
    val lastEditDatesTags: List<String>?,
    @SerializedName("last_editor")
    val lastEditor: String?,
    @SerializedName("last_image_dates_tags")
    val lastImageDatesTags: List<String>?,
    @SerializedName("last_image_t")
    val lastImageT: Int?,
    @SerializedName("last_modified_by")
    val lastModifiedBy: String?,
    @SerializedName("last_modified_t")
    val lastModifiedT: Int?,
    @SerializedName("lc")
    val lc: String?,
    @SerializedName("link")
    val link: String?,
    @SerializedName("main_countries_tags")
    val mainCountriesTags: List<MainCountriesTag>?,
    @SerializedName("manufacturing_places")
    val manufacturingPlaces: String?,
    @SerializedName("manufacturing_places_tags")
    val manufacturingPlacesTags: List<ManufacturingPlacesTag>?,
    @SerializedName("minerals_prev_tags")
    val mineralsPrevTags: List<MineralsPrevTag>?,
    @SerializedName("minerals_tags")
    val mineralsTags: List<MineralsTag>?,
    @SerializedName("misc_tags")
    val miscTags: List<String>?,
    @SerializedName("no_nutrition_data")
    val noNutritionData: String?,
    @SerializedName("nova_group")
    val novaGroup: Int?,
    @SerializedName("nova_groups")
    val novaGroups: String?,
    @SerializedName("nova_groups_markers")
    val novaGroupsMarkers: NovaGroupsMarkers?,
    @SerializedName("nova_groups_tags")
    val novaGroupsTags: List<String>?,
    @SerializedName("nucleotides_tags")
    val nucleotidesTags: List<NucleotidesTag>?,
    @SerializedName("nutrient_levels")
    val nutrientLevels: NutrientLevels?,
    @SerializedName("nutrient_levels_tags")
    val nutrientLevelsTags: List<String>?,
    @SerializedName("nutriments")
    val nutriments: Nutriments?,
    @SerializedName("nutriscore_data")
    val nutriscoreData: NutriscoreData?,
    @SerializedName("nutriscore_grade")
    val nutriscoreGrade: String?,
    @SerializedName("nutriscore_score")
    val nutriscoreScore: Int?,
    @SerializedName("nutriscore_score_opposite")
    val nutriscoreScoreOpposite: Int?,
    @SerializedName("nutrition_grade_fr")
    val nutritionGradeFr: String?,
    @SerializedName("nutrition_grades")
    val nutritionGrades: String?,
    @SerializedName("nutrition_grades_tags")
    val nutritionGradesTags: List<String>?,
    @SerializedName("nutrition_score_beverage")
    val nutritionScoreBeverage: Int?,
    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
    val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients: Int?,
    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
    val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue: Int?,
    @SerializedName("nutrition_score_warning_no_fiber")
    val nutritionScoreWarningNoFiber: Int?,
    @SerializedName("obsolete")
    val obsolete: String?,
    @SerializedName("obsolete_since_date")
    val obsoleteSinceDate: String?,
    @SerializedName("origin")
    val origin: String?,
    @SerializedName("origins")
    val origins: String?,
    @SerializedName("origins_hierarchy")
    val originsHierarchy: List<OriginsHierarchy>?,
    @SerializedName("origins_lc")
    val originsLc: String?,
    @SerializedName("origins_tags")
    val originsTags: List<OriginsTag>?,
    @SerializedName("other_nutritional_substances_tags")
    val otherNutritionalSubstancesTags: List<OtherNutritionalSubstancesTag>?,
    @SerializedName("owner")
    val owner: String?,
    @SerializedName("owner_fields")
    val ownerFields: OwnerFields?,
    @SerializedName("owners_tags")
    val ownersTags: String?,
    @SerializedName("packaging_text")
    val packagingText: String?,
    @SerializedName("packagings")
    val packagings: List<PackagingXX>?,
    @SerializedName("packagings_complete")
    val packagingsComplete: Int?,
    @SerializedName("photographers_tags")
    val photographersTags: List<String>?,
    @SerializedName("pnns_groups_1")
    val pnnsGroups1: String?,
    @SerializedName("pnns_groups_1_tags")
    val pnnsGroups1Tags: List<String>?,
    @SerializedName("pnns_groups_2")
    val pnnsGroups2: String?,
    @SerializedName("pnns_groups_2_tags")
    val pnnsGroups2Tags: List<String>?,
    @SerializedName("popularity_key")
    val popularityKey: Int?,
    @SerializedName("popularity_tags")
    val popularityTags: List<String>?,
    @SerializedName("product_name")
    val productName: String?,
    @SerializedName("product_name_en")
    val productNameEn: String?,
    @SerializedName("product_quantity")
    val productQuantity: String?,
    @SerializedName("purchase_places")
    val purchasePlaces: String?,
    @SerializedName("purchase_places_tags")
    val purchasePlacesTags: List<String>?,
    @SerializedName("quantity")
    val quantity: String?,
    @SerializedName("result")
    val result: Result?,
    @SerializedName("rev")
    val rev: Int?,
    @SerializedName("scans_n")
    val scansN: Int?,
    @SerializedName("selected_images")
    val selectedImages: SelectedImages?,
    @SerializedName("serving_quantity")
    val servingQuantity: String?,
    @SerializedName("serving_size")
    val servingSize: String?,
    @SerializedName("sources")
    val sources: List<Source>?,
    @SerializedName("sources_fields")
    val sourcesFields: SourcesFields?,
    @SerializedName("states")
    val states: String?,
    @SerializedName("states_hierarchy")
    val statesHierarchy: List<String>?,
    @SerializedName("states_tags")
    val statesTags: List<String>?,
    @SerializedName("status_id")
    val statusId: String?,
    @SerializedName("stores")
    val stores: String?,
    @SerializedName("stores_tags")
    val storesTags: List<String>?,
    @SerializedName("teams")
    val teams: String?,
    @SerializedName("teams_tags")
    val teamsTags: List<String>?,
    @SerializedName("traces")
    val traces: String?,
    @SerializedName("traces_from_ingredients")
    val tracesFromIngredients: String?,
    @SerializedName("traces_from_user")
    val tracesFromUser: String?,
    @SerializedName("traces_hierarchy")
    val tracesHierarchy: List<TracesHierarchy>?,
    @SerializedName("traces_lc")
    val tracesLc: String?,
    @SerializedName("traces_tags")
    val tracesTags: List<TracesTag>?,
    @SerializedName("unique_scans_n")
    val uniqueScansN: Int?,
    @SerializedName("unknown_ingredients_n")
    val unknownIngredientsN: Int?,
    @SerializedName("unknown_nutrients_tags")
    val unknownNutrientsTags: List<UnknownNutrientsTag>?,
    @SerializedName("update_key")
    val updateKey: String?,
    @SerializedName("vitamins_tags")
    val vitaminsTags: List<VitaminsTag>?,
)

class AddedCountriesTag

class AminoAcidsPrevTag

class AminoAcidsTag

data class CategoriesProperties(
    @SerializedName("agribalyse_food_code:en")
    val agribalyseFoodCodeEn: String?,
    @SerializedName("agribalyse_proxy_food_code:en")
    val agribalyseProxyFoodCodeEn: String?,
    @SerializedName("ciqual_food_code:en")
    val ciqualFoodCodeEn: String?
)

class CategoryProperties

class CitiesTag

class DataQualityBugsTag

class DataQualityErrorsTag

data class EcoscoreData(
    @SerializedName("adjustments")
    val adjustments: Adjustments?,
    @SerializedName("agribalyse")
    val agribalyse: Agribalyse?,
    @SerializedName("grade")
    val grade: String?,
    @SerializedName("grades")
    val grades: Grades?,
    @SerializedName("missing")
    val missing: Missing?,
    @SerializedName("missing_data_warning")
    val missingDataWarning: Int?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("scores")
    val scores: Scores?,
    @SerializedName("status")
    val status: String?
)

class EmbCodesTag

class EnvironmentImpactLevelTag

data class Error(
    @SerializedName("field")
    val `field`: Field?,
    @SerializedName("impact")
    val impact: Impact?,
    @SerializedName("message")
    val message: Message?
)

data class Images(
    @SerializedName("front")
    val front: Front?,
)

data class Ingredient(
    @SerializedName("id")
    val id: String?,
    @SerializedName("ingredients")
    val ingredients: String?,
    @SerializedName("percent")
    val percent: Int?,
    @SerializedName("percent_estimate")
    val percentEstimate: Int?,
    @SerializedName("percent_max")
    val percentMax: Int?,
    @SerializedName("percent_min")
    val percentMin: Int?,
    @SerializedName("text")
    val text: String?,
    @SerializedName("vegan")
    val vegan: String?,
    @SerializedName("vegetarian")
    val vegetarian: String?
)

data class IngredientsAnalysis(
    @SerializedName("en:palm-oil")
    val enPalmOil: List<String?>?,
    @SerializedName("en:vegan-status-unknown")
    val enVeganStatusUnknown: List<String?>?,
    @SerializedName("en:vegetarian-status-unknown")
    val enVegetarianStatusUnknown: List<String?>?
)

class IngredientsFromPalmOilTag

class IngredientsThatMayBeFromPalmOilTag

data class KnowledgePanels(
    @SerializedName("additionalProperties")
    val additionalProperties: AdditionalProperties?
)

class Languages

class LanguagesCodes

class MainCountriesTag

class ManufacturingPlacesTag

class MineralsPrevTag

class MineralsTag

data class NovaGroupsMarkers(
    @SerializedName("3")
    val x3: List<List<String?>?>?,
    @SerializedName("4")
    val x4: List<List<String?>?>?
)

class NucleotidesTag

data class NutrientLevels(
    @SerializedName("fat")
    val fat: String?,
    @SerializedName("salt")
    val salt: String?,
    @SerializedName("saturated-fat")
    val saturatedFat: String?,
    @SerializedName("sugars")
    val sugars: String?
)

data class Nutriments(
    @SerializedName("alcohol")
    val alcohol: Int?,
    @SerializedName("carbohydrates")
    val carbohydrates: Int?,
    @SerializedName("carbon-footprint-from-known-ingredients_product")
    val carbonFootprintFromKnownIngredientsProduct: Int?,
    @SerializedName("carbon-footprint-from-known-ingredients_serving")
    val carbonFootprintFromKnownIngredientsServing: Int?,
    @SerializedName("energy")
    val energy: Int?,
    @SerializedName("energy-kcal")
    val energyKcal: Int?,
    @SerializedName("energy-kj")
    val energyKj: Int?,
    @SerializedName("erythritol")
    val erythritol: Double?,
    @SerializedName("fat")
    val fat: Int?,
    @SerializedName("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    val fruitsVegetablesNutsEstimateFromIngredients100g: Int?,
    @SerializedName("nova-group")
    val novaGroup: Int?,
    @SerializedName("nutrition-score-fr")
    val nutritionScoreFr: String?,
    @SerializedName("proteins")
    val proteins: Int?,
    @SerializedName("salt")
    val salt: Int?,
    @SerializedName("saturated-fat")
    val saturatedFat: Int?,
    @SerializedName("sodium")
    val sodium: Int?,
    @SerializedName("sugars")
    val sugars: Int?
)

data class NutriscoreData(
    @SerializedName("energy")
    val energy: Int?,
    @SerializedName("energy_points")
    val energyPoints: Int?,
    @SerializedName("energy_value")
    val energyValue: Int?,
    @SerializedName("fiber")
    val fiber: Int?,
    @SerializedName("fiber_points")
    val fiberPoints: Int?,
    @SerializedName("fiber_value")
    val fiberValue: Int?,
    @SerializedName("fruits_vegetables_nuts_colza_walnut_olive_oils")
    val fruitsVegetablesNutsColzaWalnutOliveOils: Int?,
    @SerializedName("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
    val fruitsVegetablesNutsColzaWalnutOliveOilsPoints: Int?,
    @SerializedName("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
    val fruitsVegetablesNutsColzaWalnutOliveOilsValue: Int?,
    @SerializedName("grade")
    val grade: String?,
    @SerializedName("is_beverage")
    val isBeverage: Int?,
    @SerializedName("is_cheese")
    val isCheese: Int?,
    @SerializedName("is_fat")
    val isFat: Int?,
    @SerializedName("is_water")
    val isWater: Int?,
    @SerializedName("negative_points")
    val negativePoints: Int?,
    @SerializedName("positive_points")
    val positivePoints: Int?,
    @SerializedName("proteins")
    val proteins: Int?,
    @SerializedName("proteins_points")
    val proteinsPoints: Int?,
    @SerializedName("proteins_value")
    val proteinsValue: Int?,
    @SerializedName("saturated_fat")
    val saturatedFat: Int?,
    @SerializedName("saturated_fat_points")
    val saturatedFatPoints: Int?,
    @SerializedName("saturated_fat_ratio")
    val saturatedFatRatio: Int?,
    @SerializedName("saturated_fat_ratio_points")
    val saturatedFatRatioPoints: Int?,
    @SerializedName("saturated_fat_ratio_value")
    val saturatedFatRatioValue: Int?,
    @SerializedName("saturated_fat_value")
    val saturatedFatValue: Int?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("sodium")
    val sodium: Int?,
    @SerializedName("sodium_points")
    val sodiumPoints: Int?,
    @SerializedName("sodium_value")
    val sodiumValue: Int?,
    @SerializedName("sugars")
    val sugars: Int?,
    @SerializedName("sugars_points")
    val sugarsPoints: Int?,
    @SerializedName("sugars_value")
    val sugarsValue: Int?
)

class OriginsHierarchy

class OriginsTag

class OtherNutritionalSubstancesTag

data class OwnerFields(
    @SerializedName("additionalProperties")
    val additionalProperties: Int?
)

data class PackagingXX(
    @SerializedName("material")
    val material: Material?,
    @SerializedName("number_of_units")
    val numberOfUnits: Int?,
    @SerializedName("quantity_per_unit")
    val quantityPerUnit: String?,
    @SerializedName("quantity_per_unit_unit")
    val quantityPerUnitUnit: String?,
    @SerializedName("quantity_per_unit_value")
    val quantityPerUnitValue: Int?,
    @SerializedName("recycling")
    val recycling: Recycling?,
    @SerializedName("shape")
    val shape: Shape?,
    @SerializedName("weight")
    val weight: Int?,
    @SerializedName("weight_estimated")
    val weightEstimated: Int?,
    @SerializedName("weight_measured")
    val weightMeasured: Int?,
    @SerializedName("weight_source_id")
    val weightSourceId: String?,
    @SerializedName("weight_specified")
    val weightSpecified: Int?
)

data class Result(
    @SerializedName("id")
    val id: String?,
    @SerializedName("lc_name")
    val lcName: String?,
    @SerializedName("name")
    val name: String?
)

data class SelectedImages(
    @SerializedName("front")
    val front: FrontX?
)

data class Source(
    @SerializedName("fields")
    val fields: List<String?>?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("images")
    val images: List<Image?>?,
    @SerializedName("import_t")
    val importT: Int?,
    @SerializedName("manufacturer")
    val manufacturer: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("source_licence")
    val sourceLicence: String?,
    @SerializedName("source_licence_url")
    val sourceLicenceUrl: String?,
    @SerializedName("url")
    val url: Any?
)

data class SourcesFields(
    @SerializedName("org-gs1")
    val orgGs1: OrgGs1?
)

class TracesHierarchy

class TracesTag

class UnknownNutrientsTag

class VitaminsTag


data class Adjustments(
    @SerializedName("origins_of_ingredients")
    val originsOfIngredients: OriginsOfIngredients?,
    @SerializedName("packaging")
    val packaging: Packaging?,
    @SerializedName("production_system")
    val productionSystem: ProductionSystem?,
    @SerializedName("threatened_species")
    val threatenedSpecies: ThreatenedSpecies?
)

data class Agribalyse(
    @SerializedName("agribalyse_food_code")
    val agribalyseFoodCode: String?,
    @SerializedName("co2_agriculture")
    val co2Agriculture: Int?,
    @SerializedName("co2_consumption")
    val co2Consumption: Int?,
    @SerializedName("co2_distribution")
    val co2Distribution: Int?,
    @SerializedName("co2_packaging")
    val co2Packaging: Int?,
    @SerializedName("co2_processing")
    val co2Processing: Int?,
    @SerializedName("co2_total")
    val co2Total: Int?,
    @SerializedName("co2_transportation")
    val co2Transportation: Int?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("dqr")
    val dqr: String?,
    @SerializedName("ef_agriculture")
    val efAgriculture: Int?,
    @SerializedName("ef_consumption")
    val efConsumption: Int?,
    @SerializedName("ef_distribution")
    val efDistribution: Int?,
    @SerializedName("ef_packaging")
    val efPackaging: Int?,
    @SerializedName("ef_processing")
    val efProcessing: Int?,
    @SerializedName("ef_total")
    val efTotal: Int?,
    @SerializedName("ef_transportation")
    val efTransportation: Int?,
    @SerializedName("is_beverage")
    val isBeverage: Int?,
    @SerializedName("name_en")
    val nameEn: String?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("version")
    val version: String?
)

class Grades

data class Missing(
    @SerializedName("labels")
    val labels: Int?,
    @SerializedName("origins")
    val origins: Int?,
    @SerializedName("packagings")
    val packagings: Int?
)


class Scores

data class OriginsOfIngredients(
    @SerializedName("aggregated_origins")
    val aggregatedOrigins: List<AggregatedOrigin?>?,
    @SerializedName("epi_score")
    val epiScore: Int?,
    @SerializedName("epi_value")
    val epiValue: Int?,
    @SerializedName("origins_from_origins_field")
    val originsFromOriginsField: List<String?>?,
    @SerializedName("transportation_scores")
    val transportationScores: TransportationScores?,
    @SerializedName("transportation_values")
    val transportationValues: TransportationValues?,
    @SerializedName("values")
    val values: Values?,
    @SerializedName("warning")
    val warning: String?
)

data class Packaging(
    @SerializedName("non_recyclable_and_non_biodegradable_materials")
    val nonRecyclableAndNonBiodegradableMaterials: Int?,
    @SerializedName("packagings")
    val packagings: List<PackagingX>?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("value")
    val value: Int?,
    @SerializedName("warning")
    val warning: String?
)

data class ProductionSystem(
    @SerializedName("labels")
    val labels: String?,
    @SerializedName("value")
    val value: Int?,
    @SerializedName("warning")
    val warning: String?
)

data class ThreatenedSpecies(
    @SerializedName("ingredient")
    val ingredient: String?,
    @SerializedName("value")
    val value: Int?
)

data class AggregatedOrigin(
    @SerializedName("origin")
    val origin: String?,
    @SerializedName("percent")
    val percent: Int?
)

class TransportationScores

class TransportationValues

class Values

data class PackagingX(
    @SerializedName("ecoscore_material_score")
    val ecoscoreMaterialScore: Int?,
    @SerializedName("ecoscore_shape_ratio")
    val ecoscoreShapeRatio: Int?,
    @SerializedName("material")
    val material: String?,
    @SerializedName("shape")
    val shape: String?
)

data class Field(
    @SerializedName("id")
    val id: String?,
    @SerializedName("value")
    val value: String?
)

data class Impact(
    @SerializedName("description")
    val description: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("lc_description")
    val lcDescription: String?,
    @SerializedName("lc_name")
    val lcName: String?,
    @SerializedName("name")
    val name: String?
)

data class Message(
    @SerializedName("description")
    val description: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("lc_description")
    val lcDescription: String?,
    @SerializedName("lc_name")
    val lcName: String?,
    @SerializedName("name")
    val name: String?
)

data class Front(
    @SerializedName("angle")
    val angle: Int?,
    @SerializedName("coordinates_image_size")
    val coordinatesImageSize: String?,
    @SerializedName("geometry")
    val geometry: String?,
    @SerializedName("imgid")
    val imgid: String?,
    @SerializedName("normalize")
    val normalize: Any?,
    @SerializedName("rev")
    val rev: String?,
    @SerializedName("sizes")
    val sizes: Sizes?,
    @SerializedName("white_magic")
    val whiteMagic: Any?,
    @SerializedName("x1")
    val x1: String?,
    @SerializedName("x2")
    val x2: String?,
    @SerializedName("y1")
    val y1: String?,
    @SerializedName("y2")
    val y2: String?
)


data class Sizes(
    @SerializedName("full")
    val full: Full?,
    @SerializedName("100")
    val x100: X100?,
    @SerializedName("200")
    val x200: X100?,
    @SerializedName("400")
    val x400: X100?
)

data class Full(
    @SerializedName("h")
    val h: Int?,
    @SerializedName("w")
    val w: Int?
)

data class X100(
    @SerializedName("h")
    val h: Int?,
    @SerializedName("w")
    val w: Int?
)


data class AdditionalProperties(
    @SerializedName("elements")
    val elements: List<Element?>?,
    @SerializedName("expand_for")
    val expandFor: String?,
    @SerializedName("expanded")
    val expanded: Boolean?,
    @SerializedName("level")
    val level: String?,
    @SerializedName("size")
    val size: String?,
    @SerializedName("title_element")
    val titleElement: TitleElement?,
    @SerializedName("topics")
    val topics: List<String?>?,
    @SerializedName("type")
    val type: String?
)

data class Element(
    @SerializedName("action_element")
    val actionElement: String?,
    @SerializedName("image_element")
    val imageElement: ImageElement?,
    @SerializedName("panel_element")
    val panelElement: PanelElement?,
    @SerializedName("panel_group_element")
    val panelGroupElement: PanelGroupElement?,
    @SerializedName("table_element")
    val tableElement: TableElement?,
    @SerializedName("text_element")
    val textElement: TextElement?,
    @SerializedName("type")
    val type: String?
)

data class TitleElement(
    @SerializedName("grade")
    val grade: String?,
    @SerializedName("icon_color_from_evaluation")
    val iconColorFromEvaluation: String?,
    @SerializedName("icon_size")
    val iconSize: String?,
    @SerializedName("icon_url")
    val iconUrl: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("type")
    val type: String?
)

data class ImageElement(
    @SerializedName("alt_text")
    val altText: String?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)

data class PanelElement(
    @SerializedName("panel_id")
    val panelId: String?
)

data class PanelGroupElement(
    @SerializedName("panel_ids")
    val panelIds: List<String?>?,
    @SerializedName("title")
    val title: String?
)

data class TableElement(
    @SerializedName("columns")
    val columns: List<Column?>?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("rows")
    val rows: String?,
    @SerializedName("title")
    val title: String?
)

data class TextElement(
    @SerializedName("edit_field_id")
    val editFieldId: String?,
    @SerializedName("edit_field_type")
    val editFieldType: String?,
    @SerializedName("edit_field_value")
    val editFieldValue: String?,
    @SerializedName("html")
    val html: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("lc")
    val lc: String?,
    @SerializedName("source_language")
    val sourceLanguage: String?,
    @SerializedName("source_lc")
    val sourceLc: String?,
    @SerializedName("source_text")
    val sourceText: String?,
    @SerializedName("source_url")
    val sourceUrl: String?,
    @SerializedName("type")
    val type: String?
)

data class Column(
    @SerializedName("column_group_id")
    val columnGroupId: String?,
    @SerializedName("shown_by_default")
    val shownByDefault: Boolean?,
    @SerializedName("style")
    val style: String?,
    @SerializedName("text")
    val text: String?,
    @SerializedName("text_for_small_screens")
    val textForSmallScreens: String?,
    @SerializedName("type")
    val type: String?
)

data class Material(
    @SerializedName("id")
    val id: String?,
    @SerializedName("lc_name")
    val lcName: String?
)

data class Recycling(
    @SerializedName("id")
    val id: String?,
    @SerializedName("lc_name")
    val lcName: String?
)

data class Shape(
    @SerializedName("id")
    val id: String?,
    @SerializedName("lc_name")
    val lcName: String?
)

data class FrontX(
    @SerializedName("display")
    val display: Display?,
    @SerializedName("small")
    val small: Small?,
    @SerializedName("thumb")
    val thumb: Thumb?
)

class Display

class Small

class Thumb

class Image

data class OrgGs1(
    @SerializedName("gln")
    val gln: String?,
    @SerializedName("gpcCategoryCode")
    val gpcCategoryCode: String?,
    @SerializedName("gpcCategoryName")
    val gpcCategoryName: String?,
    @SerializedName("isAllergenRelevantDataProvided")
    val isAllergenRelevantDataProvided: String?,
    @SerializedName("lastChangeDateTime")
    val lastChangeDateTime: String?,
    @SerializedName("partyName")
    val partyName: String?,
    @SerializedName("productionVariantDescription")
    val productionVariantDescription: String?,
    @SerializedName("publicationDateTime")
    val publicationDateTime: String?
)