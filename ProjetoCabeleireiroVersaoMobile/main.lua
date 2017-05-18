display.setStatusBar( display.HiddenStatusBar )-- ocultar o status bar

-- O objeto principal que a API Storyboard é manipula um objeto "cena".
-- https://coronalabs.com/blog/2012/03/27/storyboard-scene-events-explained/
--https://docs.coronalabs.com/guide/system/composer/index.html
--local composer = require ("composer")
--composer.gotoScene("Agendamento")
local widget =  require ("widget")

local json = require( "json" )  -- Include the Corona JSON library

	local function handleResponse( event )
	    if not event.isError then
	        local response = json.decode( event.response )
	        print( event.response )
	    else
	        print( "Error" )
	    end
	    return
	end
 
	function function_name(event)
			print("1")
			if event.phase == "began" then
				print("2")
			local superHeroes = 	{ nome=TxtNome.text, email=TxtEmail.text, telefone=TxtTelefone.text, sexo=TxtSexo.text }
			
					--	print(superHeroes)
			local serializedString = json.encode( superHeroes )

			print( serializedString )	

			local headers = {}
					  
			headers["Content-Type"] = "application/json"

			local params = {}
			params.headers = headers

			params.body = serializedString

		network.request( "http://localhost:8084/web-service/webresources/webService/cliente/cadastro", "POST", handleResponse, params )

			end		
	end



 		TxtNome = native.newTextField(display.contentWidth/2 + 5, display.contentHeight/2 - 200, 200, 25 ) 
		TxtEmail = native.newTextField(display.contentWidth/2 + 5, display.contentHeight/2 - 150, 200, 25 ) 
		TxtTelefone = native.newTextField(display.contentWidth/2 + 15, display.contentHeight/2 - 100, 178, 25 ) 
		TxtTelefone.inputType = "number"
		TxtSexo = native.newTextField(display.contentWidth/2 + 9, display.contentHeight/2 - 50, 190, 25 ) 

		ButtonCadastrar =  widget.newButton( {label="cadastrar", x = display.contentWidth/2 + 100, y = display.contentHeight/2 ,onPress = function_name} )
	
	--	timer.performWithDelay( 10000,function_name ,0 )















--[[


local superHeroes2 = {
    { name="Clark Kent", nickname="Superman", address="Metropolis", age=32 },
--    { name="Bruce Wayne", nickname="Batman", address="Gotham", age=36 },
--	  { name="Diana Prince", nickname="Wonder Woman", address="New York", age=28 }
}
local serializedString2 = json.encode( superHeroes2 )
print( serializedString2 )]]