import io.kotlintest.specs.FlatSpec
import controller.OptionsController

class OptionsControllerTest : FlatSpec() {

    val optionController = OptionsController()

    init {

        "getBusinessName" should "return 'Example Business'" {
            optionController.getBusinessName() shouldBe "Example Business"
        }

        "getAbn" should "return '51 824 753 556'" {
            optionController.getAbn() shouldBe "51 824 753 556"
        }

        "verifyAbn" should "return true" {

        }

        "verifyAbn" should "return false" {

        }

    }
}