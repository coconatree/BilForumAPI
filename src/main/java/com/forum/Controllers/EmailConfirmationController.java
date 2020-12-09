package com.forum.Controllers;

import com.forum.Utilities.EmailCodeGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class EmailConfirmationController
{
    @GetMapping("/{EMAIl}")
    public String getEmailCode(@PathVariable String EMAIl)
    {
        String emailCode;

        emailCode = EmailCodeGenerator.createEmailCode();

        // Send the email using the email provided by the request parameter

        System.out.println(EMAIl);
        System.out.println(emailCode);

        return emailCode;
    }
}
